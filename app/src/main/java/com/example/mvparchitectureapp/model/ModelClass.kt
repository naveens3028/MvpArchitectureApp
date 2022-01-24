package com.example.mvparchitectureapp.model

import com.example.mvparchitectureapp.contract.ContractInterface

class ModelClass: ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }

}