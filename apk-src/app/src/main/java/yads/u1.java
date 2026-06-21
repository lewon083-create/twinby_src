package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u1 implements i2 {
    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return null;
        }
        try {
            u3 u3Var = new u3(activity);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setId(1);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(p9.f41841c);
            return new t1(activity, relativeLayout, q2Var, window, stringExtra, u3Var, linearLayout, r9.a(activity), r9.b(activity), new gb3(new fb3()));
        } catch (ao3 unused) {
            return null;
        }
    }
}
