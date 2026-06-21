package ma;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ads.kw0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f28789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.f28789c = fVar;
        this.f28788b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = g.f28774a;
        f fVar = this.f28789c;
        Context context = this.f28788b;
        int iC = fVar.c(context, i10);
        int i11 = j.f28781e;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = fVar.b(context, "n", iC);
            fVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
