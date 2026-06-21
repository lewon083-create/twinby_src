package yads;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R$drawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ao2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg0 f36828a;

    public /* synthetic */ ao2() {
        this(new pg0());
    }

    public final Button a(Context context) {
        Button button = new Button(context);
        button.setBackground(context.getDrawable(R$drawable.monetization_ads_video_ic_replay));
        this.f36828a.getClass();
        int iA = pg0.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public ao2(pg0 pg0Var) {
        this.f36828a = pg0Var;
    }
}
