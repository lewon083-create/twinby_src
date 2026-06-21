package aj;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends ii.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f934b = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f935a;

    public /* synthetic */ b(int i) {
        this.f935a = i;
    }

    @Override // ii.w
    public Object readValueOfType(byte b2, ByteBuffer buffer) {
        switch (this.f935a) {
            case 1:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (b2 == -127) {
                    Long l10 = (Long) readValue(buffer);
                    if (l10 != null) {
                        int iLongValue = (int) l10.longValue();
                        g0.f960c.getClass();
                        g0[] g0VarArrValues = g0.values();
                        int length = g0VarArrValues.length;
                        for (int i = 0; i < length; i++) {
                            g0 g0Var = g0VarArrValues[i];
                            if (g0Var.f965b == iLongValue) {
                            }
                        }
                    }
                } else if (b2 == -126) {
                    Object value = readValue(buffer);
                    List pigeonVar_list = value instanceof List ? (List) value : null;
                    if (pigeonVar_list != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
                        String str = (String) pigeonVar_list.get(0);
                        Object obj = pigeonVar_list.get(1);
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    }
                } else if (b2 == -125) {
                    Object value2 = readValue(buffer);
                    List pigeonVar_list2 = value2 instanceof List ? (List) value2 : null;
                    if (pigeonVar_list2 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list2, "pigeonVar_list");
                        String str2 = (String) pigeonVar_list2.get(0);
                        Object obj2 = pigeonVar_list2.get(1);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                    }
                }
                break;
        }
        return super.readValueOfType(b2, buffer);
    }

    @Override // ii.w
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f935a) {
            case 1:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (obj instanceof g0) {
                    stream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                    writeValue(stream, Long.valueOf(((g0) obj).f965b));
                } else if (obj instanceof h) {
                    stream.write(130);
                    writeValue(stream, ((h) obj).a());
                } else if (!(obj instanceof i0)) {
                    super.writeValue(stream, obj);
                } else {
                    stream.write(131);
                    i0 i0Var = (i0) obj;
                    writeValue(stream, kotlin.collections.s.f(i0Var.f971a, i0Var.f972b));
                }
                break;
            default:
                super.writeValue(stream, obj);
                break;
        }
    }
}
