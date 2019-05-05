package document

class CommonDocument {

    def name
    def toolBarElement = [
            "wholePage": ["pageTitle"],
            "panel"    : ["panelTitle", "domainNamePanel"],
            "tab"      : ["tabName", "domainNameTab"],
            "tabsPage" : ["tabsPageTitle", "tabNames", "domainNameTabsPage"],
            "treeView" : ["treeViewName", "domainNameTreeView"]
    ]

    /*
    构造函数
    * */

    def CommonDocument(str) {
        name = str
    }
}
