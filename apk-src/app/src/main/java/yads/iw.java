package yads;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iw extends kk3 {
    public iw(TextView textView) {
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
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f38562b == gwVar.f38900a) {
            textView.setText(gwVar.f38901b);
        }
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f38562b == gwVar.f38900a) {
            return Intrinsics.a(textView.getText().toString(), gwVar.f38901b);
        }
        return true;
    }
}
