package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements l1, jq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f37585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f37586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37587c;

    public d1(e1 e1Var) {
        this.f37585a = e1Var;
    }

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !string.equals(this.f37587c)) {
            return;
        }
        this.f37585a.b();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        Objects.toString(activity);
        pt2 pt2VarA = fw2.a().a(activity);
        boolean z5 = false;
        boolean z10 = pt2VarA != null && pt2VarA.i();
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
            z5 = true;
        }
        WeakReference weakReference = this.f37586b;
        if ((weakReference == null || !activity.equals((Activity) weakReference.get()) || z10) && (!z10 || z5)) {
            return;
        }
        this.f37585a.b();
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        Objects.toString(activity);
        if (this.f37586b == null) {
            this.f37586b = new WeakReference(activity);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        if (bundle == null || (weakReference = this.f37586b) == null || !Intrinsics.a(activity, (Activity) weakReference.get())) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.f37587c = string;
        bundle.putString("monetization_ads_activity_id", string);
    }
}
