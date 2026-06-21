package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.TextureView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f40092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii3 f40093b;

    public /* synthetic */ k72() {
        this(new t0(), new ii3());
    }

    public final h72 a(Context context, di3 di3Var, il1 il1Var, vd3 vd3Var, int i) {
        il1 v20Var;
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        t0 t0Var = this.f40092a;
        hl1 hl1Var = t0Var.f43142b;
        hl1Var.f39235a.getClass();
        ImageView imageView = null;
        if (il1Var.getMuteControl() == null && il1Var.getVideoProgress() == null && il1Var.getCountDownProgress() == null) {
            hl1Var.f39236b.getClass();
            v20Var = (il1) gs2.a(context, CorePlaybackControlsContainer.class, i, null);
        } else {
            v20Var = new v20(il1Var.getMuteControl(), il1Var.getVideoProgress(), il1Var.getCountDownProgress());
        }
        Button buttonA = t0Var.f43141a.f45125a.a(context);
        buttonA.setTag(kl3.a("replay_button"));
        buttonA.setVisibility(8);
        wn2 wn2Var = new wn2(context, buttonA);
        wn2Var.addView(buttonA);
        p52 p52Var = new p52(context, wn2Var, v20Var);
        t0Var.f43143c.getClass();
        il1 il1Var2 = p52Var.f41822b;
        p52Var.f41821a.setVisibility(8);
        CheckBox muteControl = il1Var2 != null ? il1Var2.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = il1Var2 != null ? il1Var2.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = il1Var2 != null ? il1Var2.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = il1Var2 != null ? il1Var2.getMuteControl() : null;
        if (muteControl2 != null) {
            Double d10 = di3Var.f37778d;
            muteControl2.setChecked((d10 != null && d10.doubleValue() == ConfigValue.DOUBLE_DEFAULT_VALUE) || di3Var.f37778d == null);
        }
        p52Var.setVisibility(8);
        ii3 ii3Var = this.f40093b;
        ii3Var.f39553b.getClass();
        if ((vd3Var != null ? vd3Var.f44004c : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kj2 kj2Var = ii3Var.f39552a;
        kj2Var.getClass();
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(context.getDrawable(R$drawable.monetization_ads_video_progress_bar_background));
        kj2Var.f40218a.getClass();
        int iB = yj.b.b(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB, iB);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        progressBar.setTag(kl3.a("video_placeholder_spinner"));
        hi3 hi3Var = new hi3(context, progressBar, imageView);
        hi3Var.addView(progressBar);
        if (imageView != null) {
            hi3Var.addView(imageView);
        }
        hi3Var.setBackgroundColor(-16777216);
        hi3Var.setVisibility(8);
        h72 h72Var = new h72(context, hi3Var, textureView, p52Var);
        h72Var.addView(hi3Var);
        h72Var.addView(textureView);
        h72Var.addView(p52Var);
        h72Var.setTag(kl3.a("native_video_view"));
        return h72Var;
    }

    public k72(t0 t0Var, ii3 ii3Var) {
        this.f40092a = t0Var;
        this.f40093b = ii3Var;
    }
}
