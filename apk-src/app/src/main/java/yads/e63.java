package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e63 extends kk3 {
    public e63(TextView textView) {
        super(textView);
    }

    @Override // yads.kk3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.kk3
    public final void b(View view, Object obj) {
        ((TextView) view).setText((String) obj);
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        String str = (String) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return String.valueOf(text).equalsIgnoreCase(str);
        }
        return false;
    }
}
