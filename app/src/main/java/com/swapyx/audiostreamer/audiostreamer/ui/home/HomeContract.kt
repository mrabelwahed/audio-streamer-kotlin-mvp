package com.swapyx.audiostreamer.audiostreamer.ui.home

import com.swapyx.audiostreamer.audiostreamer.BasePresenter
import com.swapyx.audiostreamer.audiostreamer.BaseView
import com.swapyx.audiostreamer.audiostreamer.data.audioserver.model.SessionResult

interface HomeContract {

    interface View : BaseView<Presenter> {
        fun isConnected() : Boolean

        fun openRecordScreen()

        fun showNoInternetMessage()

        fun showSessionFailed()

        fun setResultFlagOnReturn()

        fun showResultDialog()

        fun setResultOnReturn(result: SessionResult)

    }

    interface Presenter : BasePresenter {
        fun openRecordScreen()

        fun onResultOK(result: SessionResult?)
    }
}