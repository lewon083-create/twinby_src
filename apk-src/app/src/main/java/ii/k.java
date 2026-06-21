package ii;

import com.google.android.gms.internal.measurement.j4;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f21313a = new k();

    @Override // ii.m
    public final Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            y.f21324b.getClass();
            JSONTokener jSONTokener = new JSONTokener(y.a(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // ii.m
    public final ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objZ = j4.z(obj);
        if (objZ instanceof String) {
            y yVar = y.f21324b;
            String strQuote = JSONObject.quote((String) objZ);
            yVar.getClass();
            return y.b(strQuote);
        }
        y yVar2 = y.f21324b;
        String string = objZ.toString();
        yVar2.getClass();
        return y.b(string);
    }
}
