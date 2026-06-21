package d8;

import android.content.Context;
import com.google.android.gms.internal.play_billing.o1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile fd.b f15585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile s f15587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile oi.i f15588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f15589e;

    public /* synthetic */ c(Context context) {
        this.f15586b = context;
    }

    public final e a() {
        if (this.f15586b == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.f15587c == null) {
            if (this.f15588d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (!this.f15589e) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            Context context = this.f15586b;
            return b() ? new i0(context) : new e(context);
        }
        if (this.f15585a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        this.f15585a.getClass();
        if (this.f15587c == null) {
            fd.b bVar = this.f15585a;
            Context context2 = this.f15586b;
            return b() ? new i0(bVar, context2) : new e(bVar, context2);
        }
        if (this.f15588d == null) {
            fd.b bVar2 = this.f15585a;
            Context context3 = this.f15586b;
            s sVar = this.f15587c;
            return b() ? new i0(bVar2, context3, sVar) : new e(bVar2, context3, sVar);
        }
        fd.b bVar3 = this.f15585a;
        Context context4 = this.f15586b;
        s sVar2 = this.f15587c;
        oi.i iVar = this.f15588d;
        return b() ? new i0(bVar3, context4, sVar2, iVar) : new e(bVar3, context4, sVar2, iVar);
    }

    public final boolean b() {
        Context context = this.f15586b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e3) {
            o1.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e3);
            return false;
        }
    }
}
