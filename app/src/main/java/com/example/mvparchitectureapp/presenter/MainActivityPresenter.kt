package com.example.mvparchitectureapp.presenter

import com.example.mvparchitectureapp.contract.ContractInterface
import com.example.mvparchitectureapp.model.ModelClass
import com.example.mvparchitectureapp.view.MainActvity

class MainActivityPresenter(_view: MainActvity): ContractInterface.Presenter {

    private var view: MainActvity = _view
    private var model: ModelClass = ModelClass()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()

}