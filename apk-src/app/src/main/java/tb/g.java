package tb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends qa.a {
    public static final Parcelable.Creator<g> CREATOR = new l0(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f33688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f33691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33693g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.Z(parcel, 2, this.f33688b);
        j0.g.b0(parcel, 4, this.f33689c);
        j0.g.b0(parcel, 5, this.f33690d);
        j0.g.Z(parcel, 6, this.f33691e);
        boolean z5 = this.f33692f;
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(z5 ? 1 : 0);
        j0.g.b0(parcel, 8, this.f33693g);
        j0.g.m0(parcel, iI0);
    }
}
