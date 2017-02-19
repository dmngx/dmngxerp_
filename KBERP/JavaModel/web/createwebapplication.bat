@echo off

md %1\webapps\%2
md %1\webapps\%2\static
md %1\webapps\%2\gxmetadata
md %1\webapps\%2\gxmetadata\images
md %1\webapps\%2\Metadata
md %1\webapps\%2\Metadata\TableAccess
md %1\webapps\%2\WEB-INF
md %1\webapps\%2\META-INF
md %1\webapps\%2\WEB-INF\classes
md %1\webapps\%2\WEB-INF\lib
md %1\webapps\%2\static\Metadata
md %1\webapps\%2\static\Metadata\Interfaces
md %1\webapps\%2\static\devmenu
md %1\webapps\%2\static\bootstrap
md %1\webapps\%2\%7

if %3 == "5.5" goto copyFiles
md %1\conf\catalina\localhost
md %1\webapps\%2\WEB-INF\classes\dummy

if NOT %3 == "7.0" goto copyContextScanFilter
copy /Y contextGXJarScanner.xml context.xml
xcopy GXScanner.jar %1\lib /Y /D
goto :copyFiles

:copyContextScanFilter
copy /Y contextScanFilter.xml context.xml

:copyFiles
if %6 == "false" goto no_push_support
xcopy log4j-1.2.15.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-lang-2.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy bcprov-jdk15-146.jar %1\webapps\%2\WEB-INF\lib /Y /D

:no_push_support
if %5 == "true" goto native_soap_support
if exist %1\webapps\%2\WEB-INF\web_native_ws.xml del %1\webapps\%2\WEB-INF\web*.xml
xcopy web.xml %1\webapps\%2\WEB-INF /Y /D
goto :ENDnative_soap_support

:native_soap_support
if exist %1\webapps\%2\WEB-INF\web_native_ws.xml goto native_soap_support_exist
if exist %1\webapps\%2\WEB-INF\web.xml del %1\webapps\%2\WEB-INF\web.xml
copy web.xml web_native_ws.xml
copy web_native_ws.xml %1\webapps\%2\WEB-INF
copy web_native_ws.xml %1\webapps\%2\WEB-INF\web.xml
xcopy sun-jaxws.xml %1\webapps\%2\WEB-INF /Y /D
goto :ENDnative_soap_support

:native_soap_support_exist
xcopy web_native_ws.xml %1\webapps\%2\WEB-INF\web.xml /Y /D
xcopy sun-jaxws.xml %1\webapps\%2\WEB-INF /Y /D

:ENDnative_soap_support
xcopy CloudServices.config %1\webapps\%2\WEB-INF /Y /D
xcopy *.services %1\webapps\%2\WEB-INF /Y /D
xcopy .\services\*.* %1\webapps\%2\WEB-INF\lib /Y /D
xcopy .\modules\*.* %1\webapps\%2\WEB-INF\lib /Y /D
xcopy context.xml %1\webapps\%2\META-INF /Y /D
xcopy .\drivers\*.* %1\webapps\%2\WEB-INF\lib /Y /D
xcopy iText.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy iTextAsian.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy lucene-core-2.2.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy Tidy.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy lucene-highlighter-2.2.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy lucene-spellchecker-2.2.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy joda-time-2.8.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi-ooxml.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi-ooxml-schemas.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy xmlbeans.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy dom4j-1.6.1.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi-scratchpad.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy printingappletsigned.jar %1\webapps\%2 /Y /D
xcopy rbuildj.dll %1\webapps\%2 /Y /D
xcopy GXDIB32.DLL %1\webapps\%2 /Y /D
xcopy developermenu.html %1\webapps\%2\static /Y /D
xcopy .\%7\*.rpt %1\webapps\%2\%7 /Y /D
xcopy .\gxmetadata\*.* %1\webapps\%2\gxmetadata /Y /D
xcopy .\gxmetadata\images\*.* %1\webapps\%2\gxmetadata\images /Y /D
xcopy .\Metadata\Interfaces\*.* %1\webapps\%2\static\Metadata\Interfaces /Y /D
xcopy .\Metadata\TableAccess\*.* %1\webapps\%2\Metadata\TableAccess /Y /D
xcopy .\devmenu\*.* %1\webapps\%2\static\devmenu /Y /D
xcopy .\bootstrap\*.* %1\webapps\%2\static\bootstrap /Y /D /S
xcopy annotations-api.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy hk2-api-2.4.0-b34.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy hk2-locator-2.4.0-b34.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy hk2-utils-2.4.0-b34.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-annotations-2.7.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-core-2.7.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-databind-2.7.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-jaxrs-base-2.7.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-jaxrs-json-provider-2.7.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-module-jaxb-annotations-2.7.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy javax.inject-2.4.0-b34.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy javax.ws.rs-api-2.0.1.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-client.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-common.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-container-servlet-core.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-entity-filtering-2.22.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-guava-2.22.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-media-json-jackson-2.22.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-server.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy validation-api-1.1.0.Final.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy spatial4j-0.6.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jts-1.14.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jtsio-1.14.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy noggit-0.5.jar  %1\webapps\%2\WEB-INF\lib /Y /D
xcopy asm-3.1.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy GXWebSocket.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy bcprov-jdk15on-147.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy bcpkix-jdk15on-147.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jdom-2.0.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-logging.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-io-2.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-net-3.3.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-fileupload-1.3.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy xmlsec.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy xml-apis-1.4.01.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy xercesImpl.jar %1\webapps\%2\WEB-INF\lib /Y /D
if exist .\blackberry md %1\webapps\%2\blackberry
if exist .\blackberry xcopy .\blackberry\*.* %1\webapps\%2\blackberry /Y /D

if %4 == "false" goto noDebug
if exist %1\webapps\%2\WEB-INF\lib\gxclassD.jar goto xcopyGXCLASSD
if exist %1\webapps\%2\WEB-INF\lib\gxclassR.jar del %1\webapps\%2\WEB-INF\lib\gxclassR.jar
copy gxclassD.zip %1\webapps\%2\WEB-INF\lib\gxclassD.jar
goto :ENDxcopyGXCLASSR

:xcopyGXCLASSD
xcopy gxclassD.zip %1\webapps\%2\WEB-INF\lib\gxclassD.jar /Y /D
goto :ENDxcopyGXCLASSR


:noDebug
if exist %1\webapps\%2\WEB-INF\lib\gxclassR.jar goto xcopyGXCLASSR
if exist %1\webapps\%2\WEB-INF\lib\gxclassD.jar del %1\webapps\%2\WEB-INF\lib\gxclassD.jar
copy gxclassR.zip %1\webapps\%2\WEB-INF\lib\gxclassR.jar
goto :ENDxcopyGXCLASSR

:xcopyGXCLASSR
xcopy gxclassR.zip %1\webapps\%2\WEB-INF\lib\gxclassR.jar /Y /D
:ENDxcopyGXCLASSR


if %3 == "5.5" goto end
if exist %1\conf\catalina\localhost\%2.xml goto xcopyCONTEXT
copy  context.xml %1\conf\catalina\localhost\%2.xml
goto :ENDxcopyCONTEXT

:xcopyCONTEXT
xcopy  context.xml %1\conf\catalina\localhost\%2.xml /Y /D
:ENDxcopyCONTEXT

if exist .\private\notifications.json md %1\webapps\%2\WEB-INF\private
if exist .\private\notifications.json xcopy .\private\*.* %1\webapps\%2\WEB-INF\private /Y /D

if exist .\swagger.yaml xcopy .\swagger.yaml %1\webapps\%2\static /Y /D
:end