package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends f.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f15458h;

    public m(n nVar) {
        this.f15458h = nVar;
    }

    @Override // f.h
    public final void b(int i, g.b contract, Object obj) {
        Bundle bundleExtra;
        int i10;
        Intrinsics.checkNotNullParameter(contract, "contract");
        n nVar = this.f15458h;
        g.a synchronousResult = contract.getSynchronousResult(nVar, obj);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new l(this, i, synchronousResult, 0));
            return;
        }
        Intent intentCreateIntent = contract.createIntent(nVar, obj);
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            Intrinsics.b(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(nVar.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
            String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            t1.b.e(nVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
            nVar.startActivityForResult(intentCreateIntent, i, bundle);
            return;
        }
        f.i iVar = (f.i) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Intrinsics.b(iVar);
            i10 = i;
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            i10 = i;
        }
        try {
            nVar.startIntentSenderForResult(iVar.f16468b, i10, iVar.f16469c, iVar.f16470d, iVar.f16471e, 0, bundle);
            Unit unit = Unit.f27471a;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
            new Handler(Looper.getMainLooper()).post(new l(this, i10, e, 1));
        }
    }
}
