package t9;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.bx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends i0 {
    @Override // t9.h0
    public final void o(final Activity activity) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.D1)).booleanValue() && p9.k.C.f31302h.g().q() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: t9.j0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    bx bxVar = p9.k.C.f31302h;
                    if (bxVar.g().q() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = "";
                        if (displayCutout != null) {
                            e0 e0VarG = bxVar.g();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                int i = rect.left;
                                int i10 = rect.top;
                                int i11 = rect.right;
                                int i12 = rect.bottom;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(i);
                                sb2.append(StringUtils.COMMA);
                                sb2.append(i10);
                                sb2.append(StringUtils.COMMA);
                                sb2.append(i11);
                                String strJ = l7.o.j(i12, StringUtils.COMMA, sb2);
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(strJ);
                            }
                            e0VarG.r(strConcat);
                        } else {
                            bxVar.g().r("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // t9.h0
    public final int p(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
