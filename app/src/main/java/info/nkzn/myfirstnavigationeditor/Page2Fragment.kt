package info.nkzn.myfirstnavigationeditor

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Page2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnGotoPage3 = view.findViewById<Button>(R.id.btn_goto_page3)
        btnGotoPage3.setOnClickListener{
            val volumeAction = Page2FragmentDirections.volumeAction()
            volumeAction.setVolume(222)
            it.findNavController().navigate(volumeAction)
        }

        val btnGotoPage4 = view.findViewById<Button>(R.id.btn_goto_page4)
        btnGotoPage4.setOnClickListener{
            val amountAction = Page2FragmentDirections.amountAction()
            amountAction.setAmount(1111)
            it.findNavController().navigate(amountAction)
        }
    }
}
