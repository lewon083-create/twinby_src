package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jq1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<jq1> CREATOR = new iq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f39931c;

    public jq1(ArrayList arrayList, Map map) {
        this.f39930b = arrayList;
        this.f39931c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f39930b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((sq1) it.next()).writeToParcel(parcel, i);
        }
        Map map = this.f39931c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
