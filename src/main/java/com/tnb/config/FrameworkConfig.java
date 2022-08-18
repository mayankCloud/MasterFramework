package com.tnb.config;

import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.RunModeBrowserType;
import com.tnb.config.converters.StringToBrowserTypeConverter;
import org.aeonbits.owner.Config;
import org.openqa.selenium.remote.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();
}
