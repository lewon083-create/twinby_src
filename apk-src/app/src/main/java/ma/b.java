package ma;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends qa.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f28762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f28764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f28759g = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new kb.i(5);

    public b(int i, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f28760b = i;
        this.f28761c = i10;
        this.f28762d = pendingIntent;
        this.f28763e = str;
        this.f28764f = num;
    }

    public static String e(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return l7.o.l(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public final boolean c() {
        return this.f28761c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f28761c == bVar.f28761c && c0.m(this.f28762d, bVar.f28762d) && c0.m(this.f28763e, bVar.f28763e) && c0.m(this.f28764f, bVar.f28764f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28761c), this.f28762d, this.f28763e, this.f28764f});
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        iVar.b(e(this.f28761c), "statusCode");
        iVar.b(this.f28762d, "resolution");
        iVar.b(this.f28763e, "message");
        iVar.b(this.f28764f, "clientMethodKey");
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f28760b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f28761c);
        j0.g.a0(parcel, 3, this.f28762d, i);
        j0.g.b0(parcel, 4, this.f28763e);
        Integer num = this.f28764f;
        if (num != null) {
            j0.g.h0(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        j0.g.m0(parcel, iI0);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
