package com.trung.hw3problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trung.hw3problem2.data.ElectronicProduct
import kotlinx.android.synthetic.main.activity_electronic.*

class ElectronicActivity : AppCompatActivity() {

    val electronicProducts = arrayListOf<ElectronicProduct>().apply {
        add(ElectronicProduct("Samsung Galaxy A52 5G", 399.99, "Black", "galaxya52", "1", "About this item\n" +
                "Carry On with Long-Lasting Battery: Nothing kills the vibe faster than a low battery notification; Worry not with Galaxy A42 5G’s long-lasting 5,000mAh battery and 15W Fast Charging\n" +
                "Fast, Reliable 5G Performance: Galaxy A42 5G mobile phone features plenty of processing power to post photos and videos, play games, and chat with friends with minimal lag\n" +
                "Expandable Storage: Comes with 128GB of storage built in, giving you plenty of space to keep your favorite photos and videos close at hand; Want more? Store up to 1TB more by adding a MicroSD card\n" +
                "Versatile Camera Experience: With 4 cameras to choose from and AI-powered features such as Night Mode, Live Focus, and Single Take, your smartphone is like your own personal film studio\n" +
                "Infinite Display: With a 6.6” Infinity-U Super AMOLED display, your view is massively awesome with crystal-clear clarity and vibrant color\n" +
                "Modern Minimalism with a Twist: A smooth finish with a subtle color gradient gives the Samsung Galaxy A42 5G cell phone a unique and sophisticated feel"))

        add(ElectronicProduct("Moto G Power | 2021", 199.99, "Black", "moto", "2", "About this item\n" +
                "Unlocked for the freedom to choose your carrier. Compatible with AT&T, Sprint, T-Mobile, and Verizon networks. Sim card not included. Customers may need to contact Sprint for activation on Sprint’s network. To use this Device on Verizon, first, provision your SIM through Verizon Wireless. Log in to your account on Verizon Wireless. Devices > activate or switch devices > activate.\n" +
                "Up to three-day battery. Capture more of life without stopping to recharge thanks to a 5000 mAh battery.Aspect Ratio: 19:9\n" +
                "48 MP triple camera system. Take stunning photos in any light, as well as beautifully blurred portraits and incredibly detailed closeups.\n" +
                "6.6\" Max Vision HD, display. Watch games, movies, and video chats come to life on an ultra-wide screen.\n" +
                "Has a 2020 Qualcomm Snapdragon 662 processor, updated from the 2019 Qualcomm Snapdragon 665 in the moto g power 2020.Lag-free performance. Get more done without slowing down thanks to a speedy Qualcomm Snapdragon 662 processor.\n" +
                "Water-repellent design3. Keep your phone safe from accidental spills and splashes.\n" +
                "My UX Your phone. Your experience. With My UX, your phone works the way you want. Control it with simple gestures, customize your entertainment settings, and create a look that’s one in a million. The new My UX. It’s all you."))

        add(ElectronicProduct("Apple iPhone 8, US Version", 184.99, "Black", "iphone", "3", "Product works and looks like new. Backed by the 90-day Amazon Renewed Guarantee.\n" +
                "- This pre-owned product is not Apple certified, but has been professionally inspected, tested and cleaned by Amazon-qualified suppliers.\n" +
                "- There will be no visible cosmetic imperfections when held at an arm’s length.\n" +
                "- This product will have a battery which exceeds 80% capacity relative to new.\n" +
                "- Accessories may not be original, but will be compatible and fully functional. Product may come in generic Box.\n" +
                "- Product will come with a SIM removal tool, a charger and a charging cable. Headphones and SIM card are not included.\n" +
                "- This product is eligible for a replacement or refund within 90 days of receipt if you are not satisfied under the Amazon Renewed Guarantee. "))

        add(ElectronicProduct("TracFone My Flip 2 4G LTE ", 19.88, "Black", "tracfone", "4", "About this item\n" +
                "2.8\" Internal Screen; 1.44\" External Preview Display; Google Assistant; 1.1 GHz Quad-Core Processor; Internal Memory 4GB; 4G LTE; Wi-Fi Capable; Bluetooth Capable; Internet Access; 2MP Camera & Video Recorder; Externa Caller ID; Supports Micro SD memory card up to 32GB (not included); SOS Button\n" +
                "Google Is Here To Assist You. As part of the KaiOS experience, the MY FLIP 2 comes preloaded with Google Assistant, which helps you get things done and find answers on the go, using just your voice.\n" +
                "Accessibility For All. The MY FLIP 2 comes with a host of accessibility features Real-Time-Text (RTT) and hearing aid compatibility that enables any user to easily stay connected. Plus, a dedicated external SOS button allows the user to call for help in case of an emergency.\n" +
                "BIG BUTTONS and large, legible numbers and make dialing effortless.\n" +
                "POWERFUL SPEAKER ensures every conversation will be loud and clear.\n"))

        add(ElectronicProduct("Samsung Electronics Galaxy A42 5G", 349.99, "Black", "galaxya42", "5", "About this item\n" +
                "Carry On with Long-Lasting Battery: Nothing kills the vibe faster than a low battery notification; Worry not with Galaxy A42 5G’s long-lasting 5,000mAh battery and 15W Fast Charging\n" +
                "Fast, Reliable 5G Performance: Galaxy A42 5G mobile phone features plenty of processing power to post photos and videos, play games, and chat with friends with minimal lag\n" +
                "Expandable Storage: Comes with 128GB of storage built in, giving you plenty of space to keep your favorite photos and videos close at hand; Want more? Store up to 1TB more by adding a MicroSD card\n" +
                "Versatile Camera Experience: With 4 cameras to choose from and AI-powered features such as Night Mode, Live Focus, and Single Take, your smartphone is like your own personal film studio\n" +
                "Infinite Display: With a 6.6” Infinity-U Super AMOLED display, your view is massively awesome with crystal-clear clarity and vibrant color\n" +
                "Modern Minimalism with a Twist: A smooth finish with a subtle color gradient gives the Samsung Galaxy A42 5G cell phone a unique and sophisticated feel\n"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        val electronicAdapter = ElectronicAdapter(this, electronicProducts)
        rv.adapter = electronicAdapter
    }


}