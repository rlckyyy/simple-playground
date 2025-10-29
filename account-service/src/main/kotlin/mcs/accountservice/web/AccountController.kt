package mcs.accountservice.web

import mcs.accountservice.data.entity.Account
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/accounts")
class AccountController {

    @GetMapping("/{id}")
    fun getAccountById(@PathVariable id: Long): Account {
        return Account()
    }
}