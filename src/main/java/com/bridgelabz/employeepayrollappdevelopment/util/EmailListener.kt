package com.bridgelabz.employeepayrollappdevelopment.util;
import com.bridgelabz.employeepayrollappdevelopment.util.EmailSenderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EmailListener {
    @Autowired
    private val sender: EmailSenderService? = null

    //@EventListener(ApplicationReadyEvent.class)
    fun sendMail() {
        sender!!.sendEmail("neeta.mourya@bridgelabz.com", "Test Email", "Registered SuccessFully1")
    }
}