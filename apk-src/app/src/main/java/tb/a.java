package tb;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33663e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f33665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33666d;

    public final void a(Task task) {
        if (this.f33666d) {
            return;
        }
        int i = 1;
        this.f33666d = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (task == null) {
            c.a(activity, this.f33664b, 0, new Intent());
            return;
        }
        int i10 = this.f33664b;
        int i11 = c.f33675c;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        if (task.getException() instanceof na.k) {
            try {
                ((na.k) task.getException()).a(activity, i10);
                return;
            } catch (IntentSender.SendIntentException e3) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e3);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            j jVar = (j) task.getResult();
            jVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            jVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            intent.putExtra("com.google.android.gms.wallet.PaymentData", bArrMarshall);
            i = -1;
        } else if (task.getException() instanceof na.d) {
            na.d dVar = (na.d) task.getException();
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(dVar.f29186b.f2633b, dVar.getMessage(), null, null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", task.getException());
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
        }
        c.a(activity, i10, i, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33664b = getArguments().getInt("requestCode");
        if (c.f33674b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f33665c = null;
        } else {
            this.f33665c = (b) b.f33668f.get(getArguments().getInt("resolveCallId"));
        }
        this.f33666d = bundle != null && bundle.getBoolean("delivered");
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b bVar = this.f33665c;
        if (bVar == null || bVar.f33671c != this) {
            return;
        }
        bVar.f33671c = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f33665c;
        if (bVar != null) {
            bVar.f33671c = this;
            bVar.a();
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            a(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f33666d);
        b bVar = this.f33665c;
        if (bVar == null || bVar.f33671c != this) {
            return;
        }
        bVar.f33671c = null;
    }
}
