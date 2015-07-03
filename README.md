# FastBrowser
OpenSource FastBrowser
Features

Bookmarks

History

Multiple search engines (Google, Bing, Yahoo, StartPage, DuckDuckGo, etc.)

Incognito mode

Flash support (prior to 4.4)

Follows Google design guidelines

Unique utilization of navigation drawer for tabs

Google search suggestions

Orbot Proxy support
Permissions

INTERNET: For accessing the web

WRITE_EXTERNAL_STORAGE: For downloading files from the browser

READ_EXTERNAL_STORAGE: For downloading files from the browser

ACCESS_FINE_LOCATION: For sites like Google Maps, it is disabled by default in settings and displays a pop-up asking if a site may use your location when it is enabled

READ_HISTORY_BOOKMARKS: To synchronize history and bookmarks between the stock browser and FastBrowser

WRITE_HISTORY_BOOKMARKS: To synchronize history and bookmarks between the stock browser and FastBrowser

ACCESS_NETWORK_STATE: Required for the WebView to function by some OEM versions of WebKit

Setting Up the Project

Due to the inclusion of the netcipher library for Orbot proxy support, importing the project will show you some errors. To fix this, first run the following git command in your project folder (NOTE: You need the git command installed to use this):


