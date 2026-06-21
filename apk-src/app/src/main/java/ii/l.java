package ii;

import com.google.android.gms.internal.measurement.j4;
import io.sentry.protocol.Request;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f21314a = new l();

    @Override // ii.r
    public n a(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                objNextValue = null;
            } else {
                try {
                    y.f21324b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(y.a(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e3) {
                    throw new IllegalArgumentException("Invalid JSON", e3);
                }
            }
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                Object obj2 = jSONObject.get(Request.JsonKeys.METHOD);
                Object objOpt = jSONObject.opt("args");
                if (objOpt != JSONObject.NULL) {
                    obj = objOpt;
                }
                if (obj2 instanceof String) {
                    return new n((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objNextValue);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // ii.r
    public ByteBuffer b(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(j4.z(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objZ = j4.z(jSONArrayPut);
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

    @Override // ii.r
    public ByteBuffer c(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(j4.z(str)).put(JSONObject.NULL).put(j4.z(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objZ = j4.z(jSONArrayPut);
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

    @Override // ii.r
    public ByteBuffer d(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(j4.z(str2)).put(j4.z(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objZ = j4.z(jSONArrayPut);
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

    @Override // ii.r
    public Object e(ByteBuffer byteBuffer) {
        try {
            try {
                y.f21324b.getClass();
                JSONTokener jSONTokener = new JSONTokener(y.a(byteBuffer));
                Object objNextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (objNextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objNextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object objOpt = jSONArray.opt(0);
                        if (objOpt == JSONObject.NULL) {
                            return null;
                        }
                        return objOpt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object objOpt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (objOpt2 == obj3) {
                            objOpt2 = null;
                        }
                        Object objOpt3 = jSONArray.opt(2);
                        if (objOpt3 != obj3) {
                            obj = objOpt3;
                        }
                        if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                            throw new j((String) obj2, (String) objOpt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // ii.r
    public ByteBuffer f(n nVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Request.JsonKeys.METHOD, nVar.f21315a);
            jSONObject.put("args", j4.z(nVar.f21316b));
            Object objZ = j4.z(jSONObject);
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
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
