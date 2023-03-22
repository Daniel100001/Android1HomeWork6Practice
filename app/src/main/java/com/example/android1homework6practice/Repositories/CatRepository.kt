package com.example.android1homework6practice.Repositories

import com.example.android1homework6practice.data.CatModel

class CatRepository {
    private val catAddress: String = "https://http.cat/"
    private val catModelList = mutableListOf<CatModel>()

    fun getLisOfCat() : MutableList<CatModel>{
        catModelList.add(CatModel("${catAddress}100", "Continue", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}101", "Switching Protocols", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}102", "Processing", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}103", "Early Hints", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}200", "Ok", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}201", "Created", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}202", "Accepted", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}203", "Non-Authoritative", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}204", "No Content", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}206", "Partial Content", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}207", "Multi-Status", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}300", "Multiple Choices", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}301", "Moved Permanently", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}302", "Found", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}303", "See Other", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}304", "Not Modified", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}305", "Use Proxy", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}307", "Temporary Redirect", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}308", "Permanent Redirect", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}400", "Bad Request", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}401", "Unauthorized", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}402", "Payment Required", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}403", "Forbidden", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}404", "Not Found", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}405", "Method Not Allowed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}406", "Not Acceptable", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}407", "Proxy Authentication Required", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}408", "Request Timeout", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}409", "Conflict", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}410", "Gone", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}411", "Length Required", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}412", "Precondition Failed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}413", "Payload Too Large", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}414", "URI Too Long", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}415", "Unsupported Media", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}416", "Range Not Satisfiable", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}418", "I'm a teapot", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}421", "Misdirected Request", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}423", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}424", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}425", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}426", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))

        return catModelList

    }
}