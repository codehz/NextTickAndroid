package codehz.nexttick.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import codehz.nexttick.R;
import codehz.nexttick.databinding.CardContentBinding;
import codehz.nexttick.model.CardData;

public class Card extends CardView {
    private CardContentBinding cardContentBinding = null;
    public Card(Context context) {
        super(context);
        initialize(context, null, 0);
    }

    public Card(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs, 0);
    }

    public Card(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs, defStyleAttr);
    }

    private void initialize(Context context, AttributeSet attrs, int defStyleAttr) {
        cardContentBinding = DataBindingUtil.inflate(
                LayoutInflater.from(getContext()),
                R.layout.card_content, this, true);
        cardContentBinding.setData(new CardData.VoidCard());
    }
}
