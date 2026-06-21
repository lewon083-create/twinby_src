package hi;

import com.google.android.gms.internal.ads.om1;
import l7.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20627e;

    public m(int i, int i10, int i11, int i12, String str) {
        if (!(i == -1 && i10 == -1) && (i < 0 || i10 < 0)) {
            throw new IndexOutOfBoundsException(om1.j("invalid selection: (", i, ", ", i10, ")"));
        }
        if (!(i11 == -1 && i12 == -1) && (i11 < 0 || i11 > i12)) {
            throw new IndexOutOfBoundsException(om1.j("invalid composing range: (", i11, ", ", i12, ")"));
        }
        if (i12 > str.length()) {
            throw new IndexOutOfBoundsException(o.i(i11, "invalid composing start: "));
        }
        if (i > str.length()) {
            throw new IndexOutOfBoundsException(o.i(i, "invalid selection start: "));
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException(o.i(i10, "invalid selection end: "));
        }
        this.f20623a = str;
        this.f20624b = i;
        this.f20625c = i10;
        this.f20626d = i11;
        this.f20627e = i12;
    }

    public static m a(JSONObject jSONObject) throws JSONException {
        return new m(jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"), jSONObject.getString("text"));
    }
}
