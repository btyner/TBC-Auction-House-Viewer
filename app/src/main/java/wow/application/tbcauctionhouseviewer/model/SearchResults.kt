package wow.application.tbcauctionhouseviewer.model

data class SearchResults<T>(
    var page: Int = -1,
    var pageSize: Int = -1,
    var maxPageSize: Int = -1,
    var pageCount: Int = -1,
    var results: List<ResultItem<T>>
)
