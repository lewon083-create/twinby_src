package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class li extends qa.a {
    public static final Parcelable.Creator<li> CREATOR = new ji(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f7529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7530h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7532k;

    public li(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z5, long j11, String str5, int i) {
        this.f7524b = str;
        this.f7525c = j10;
        this.f7526d = str2 == null ? "" : str2;
        this.f7527e = str3 == null ? "" : str3;
        this.f7528f = str4 == null ? "" : str4;
        this.f7529g = bundle == null ? new Bundle() : bundle;
        this.f7530h = z5;
        this.i = j11;
        this.f7531j = str5;
        this.f7532k = i;
    }

    public static li a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 51);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                u9.i.h(sb2.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j10 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new li(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e3) {
            e = e3;
            u9.i.i("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e7) {
            e = e7;
            u9.i.i("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f7524b);
        j0.g.h0(parcel, 3, 8);
        parcel.writeLong(this.f7525c);
        j0.g.b0(parcel, 4, this.f7526d);
        j0.g.b0(parcel, 5, this.f7527e);
        j0.g.b0(parcel, 6, this.f7528f);
        j0.g.V(parcel, 7, this.f7529g);
        j0.g.h0(parcel, 8, 4);
        parcel.writeInt(this.f7530h ? 1 : 0);
        long j10 = this.i;
        j0.g.h0(parcel, 9, 8);
        parcel.writeLong(j10);
        j0.g.b0(parcel, 10, this.f7531j);
        int i10 = this.f7532k;
        j0.g.h0(parcel, 11, 4);
        parcel.writeInt(i10);
        j0.g.m0(parcel, iI0);
    }
}
