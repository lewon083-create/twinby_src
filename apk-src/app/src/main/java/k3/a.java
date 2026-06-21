package k3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.b7;
import io.appmetrica.analytics.impl.lp;
import m3.v;
import s3.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f26840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f26841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b7 f26842c;

    public a(b7 b7Var, v vVar, t tVar) {
        this.f26842c = b7Var;
        this.f26841b = vVar;
        this.f26840a = tVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f26841b.c(new lp(11, this));
        }
    }
}
