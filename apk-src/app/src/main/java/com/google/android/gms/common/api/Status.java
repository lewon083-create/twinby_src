package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import java.util.Arrays;
import kb.i;
import l7.o;
import ma.b;
import na.l;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements l, ReflectedParcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f2635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f2636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f2629f = new Status(0, null, null, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f2630g = new Status(14, null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f2631h = new Status(8, null, null, null);
    public static final Status i = new Status(15, null, null, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f2632j = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new i(11);

    public Status(int i10, String str, PendingIntent pendingIntent, b bVar) {
        this.f2633b = i10;
        this.f2634c = str;
        this.f2635d = pendingIntent;
        this.f2636e = bVar;
    }

    public final boolean c() {
        return this.f2633b <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2633b == status.f2633b && c0.m(this.f2634c, status.f2634c) && c0.m(this.f2635d, status.f2635d) && c0.m(this.f2636e, status.f2636e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2633b), this.f2634c, this.f2635d, this.f2636e});
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        String strJ = this.f2634c;
        if (strJ == null) {
            int i10 = this.f2633b;
            switch (i10) {
                case -1:
                    strJ = "SUCCESS_CACHE";
                    break;
                case 0:
                    strJ = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strJ = o.j(i10, "unknown status code: ", new StringBuilder(String.valueOf(i10).length() + 21));
                    break;
                case 2:
                    strJ = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strJ = "SERVICE_DISABLED";
                    break;
                case 4:
                    strJ = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strJ = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strJ = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strJ = "NETWORK_ERROR";
                    break;
                case 8:
                    strJ = "INTERNAL_ERROR";
                    break;
                case 10:
                    strJ = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strJ = "ERROR";
                    break;
                case 14:
                    strJ = "INTERRUPTED";
                    break;
                case 15:
                    strJ = "TIMEOUT";
                    break;
                case 16:
                    strJ = "CANCELED";
                    break;
                case 17:
                    strJ = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strJ = "DEAD_CLIENT";
                    break;
                case 19:
                    strJ = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strJ = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strJ = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strJ = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        iVar.b(strJ, "statusCode");
        iVar.b(this.f2635d, "resolution");
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f2633b);
        g.b0(parcel, 2, this.f2634c);
        g.a0(parcel, 3, this.f2635d, i10);
        g.a0(parcel, 4, this.f2636e, i10);
        g.m0(parcel, iI0);
    }

    @Override // na.l
    public final Status getStatus() {
        return this;
    }
}
