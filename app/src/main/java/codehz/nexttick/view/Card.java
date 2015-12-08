package codehz.nexttick.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

public class Card extends CardView {
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

    }
}
