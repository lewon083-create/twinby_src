package androidx.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.j4;
import io.sentry.flutter.SafeReplayRecorderCallbacks;
import io.sentry.flutter.SentryFlutterPlugin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1584c;

    public /* synthetic */ q0(int i, Object obj) {
        this.f1583b = i;
        this.f1584c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        switch (this.f1583b) {
            case 0:
                return p0.e((a1) this.f1584c);
            case 1:
                int iOrdinal = ((b0.a) this.f1584c).a().ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 3;
                            if (iOrdinal != 3) {
                                throw new ij.j();
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 2:
                return new d.u((d.w) this.f1584c);
            case 3:
                return ((g0.d0) ((com.google.firebase.messaging.y) this.f1584c).f14899b).s(34);
            case 4:
                return SentryFlutterPlugin.Companion.setupReplay$lambda$4((SafeReplayRecorderCallbacks) this.f1584c);
            case 5:
                return kotlin.jvm.internal.j.a((Object[]) this.f1584c);
            case 6:
                o6.g gVar = (o6.g) this.f1584c;
                gVar.getLifecycle().a(new o6.b(gVar));
                return Unit.f27471a;
            case 7:
                a1.m mVar = (a1.m) this.f1584c;
                Context context = (Activity) mVar.f363c;
                if (context == null) {
                    context = (Context) mVar.f362b;
                }
                return om1.x(context.getPackageName(), ".flutter.share_provider");
            case 8:
                sk.g gVar2 = (sk.g) this.f1584c;
                return Integer.valueOf(uk.o0.d(gVar2, gVar2.f32933k));
            case 9:
                return j4.d("kotlin.Unit", sk.i.f32940e, new sk.f[0], new ek.o(6, (uk.v) this.f1584c));
            default:
                Activity activity = (Activity) this.f1584c;
                Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setPackage(null);
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setFlags(67108864);
                }
                activity.startActivity(launchIntentForPackage);
                return Unit.f27471a;
        }
    }
}
