package com.android.billingclient.api;

import a7.l;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.o1;
import d.n;
import f.c;
import g.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f2421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f2422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResultReceiver f2423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ResultReceiver f2424f;

    @Override // d.n, t1.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2421c = registerForActivityResult(new i(3), new l(12, this));
        this.f2422d = registerForActivityResult(new i(3), new fe.c(11, this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f2423e = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f2424f = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        o1.f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f2423e = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            c cVar = this.f2421c;
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            cVar.a(new f.i(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f2424f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            c cVar2 = this.f2422d;
            Intrinsics.checkNotNullParameter(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender2, "getIntentSender(...)");
            Intrinsics.checkNotNullParameter(intentSender2, "intentSender");
            cVar2.a(new f.i(intentSender2, null, 0, 0));
        }
    }

    @Override // d.n, t1.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2423e;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2424f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
