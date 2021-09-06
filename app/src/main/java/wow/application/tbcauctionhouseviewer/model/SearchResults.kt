package wow.application.tbcauctionhouseviewer.model

data class SearchResults<T>(
    val page: Int = -1,
    val pageSize: Int = -1,
    val maxPageSize: Int = -1,
    val pageCount: Int = -1,
    val results: List<ResultItem<T>>
)
