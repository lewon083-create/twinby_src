package d8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.o1;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f15583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f15584d;

    public b0(WeakReference weakReference, y yVar) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback", 2);
        this.f15583c = weakReference;
        this.f15584d = yVar;
    }

    @Override // cb.c
    public final boolean w1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
        com.google.android.gms.internal.play_billing.e.b(parcel);
        y yVar = this.f15584d;
        if (bundle == null) {
            yVar.send(6, null);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            o1.g("BillingClient", "Response bundle doesn't contain a response code");
            yVar.send(6, bundle);
            return true;
        }
        int iA = o1.a(bundle, "BillingClient");
        if (iA != 0) {
            o1.g("BillingClient", "Unable to launch intent for alternative billing only dialog" + iA);
            yVar.send(iA, bundle);
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            o1.f("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            yVar.send(0, bundle);
            return true;
        }
        try {
            Activity activity = (Activity) this.f15583c.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", yVar);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
            return true;
        } catch (RuntimeException e3) {
            o1.h("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e3);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            String name = e3.getClass().getName();
            String message = e3.getMessage();
            if (message == null) {
                message = "";
            }
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
            yVar.send(6, bundle2);
            return true;
        }
    }
}
