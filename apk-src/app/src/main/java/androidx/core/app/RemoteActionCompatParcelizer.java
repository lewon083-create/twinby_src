package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import w6.a;
import w6.b;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f1315a;
        boolean z5 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f1315a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f1316b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f35166e);
        }
        remoteActionCompat.f1316b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1317c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f35166e);
        }
        remoteActionCompat.f1317c = charSequence2;
        remoteActionCompat.f1318d = (PendingIntent) aVar.f(remoteActionCompat.f1318d, 4);
        boolean z10 = remoteActionCompat.f1319e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).f35166e.readInt() != 0;
        }
        remoteActionCompat.f1319e = z10;
        boolean z11 = remoteActionCompat.f1320f;
        if (!aVar.e(6)) {
            z5 = z11;
        } else if (((b) aVar).f35166e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f1320f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1315a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1316b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f35166e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1317c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1318d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f1319e;
        aVar.h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z10 = remoteActionCompat.f1320f;
        aVar.h(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
