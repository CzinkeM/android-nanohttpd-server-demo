package hu.mczinke.android_nanohttpd_sever_demo

import fi.iki.elonen.NanoHTTPD

class AndroidWebServer: NanoHTTPD {

    constructor(port: Int) : super(port)

    constructor(hostname: String, port: Int): super(hostname, port)

    override fun serve(session: IHTTPSession?): Response {
        val msg = "<html><body><h1>Hello server</h1>\n"
        return newFixedLengthResponse(msg)
    }
}