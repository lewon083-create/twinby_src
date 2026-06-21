package ch;

import aj.e;
import com.yandex.div.internal.parser.JsonParsers;
import fj.d1;
import fj.u0;
import fj.z0;
import hk.v0;
import hk.x;
import io.sentry.Integration;
import io.sentry.flutter.SentryFlutterPlugin;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import ni.h1;
import ni.l1;
import vk.l;
import vk.o;
import w0.f;
import wk.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2275b;

    public /* synthetic */ a(int i) {
        this.f2275b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2275b) {
            case 0:
                return JsonParsers.lambda$static$3(obj);
            case 1:
                Sequence it = (Sequence) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.iterator();
            case 2:
                return obj;
            case 3:
                return Boolean.valueOf(obj == null);
            case 4:
                return null;
            case 5:
                int i = u0.f19426h;
                return null;
            case 6:
                int i10 = z0.f19465c;
                return null;
            case 7:
                int i11 = d1.f19333e;
                return null;
            case 8:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof x) {
                    return (x) element;
                }
                return null;
            case 9:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof v0) {
                    return (v0) element2;
                }
                return null;
            case 10:
                return Boolean.valueOf(SentryFlutterPlugin.Companion.setupReplay$lambda$3((Integration) obj));
            case 11:
                l1 l1Var = (l1) obj;
                if (l1Var.f29436d) {
                    Throwable th2 = l1Var.f29435c;
                    Objects.requireNonNull(th2);
                    h1.a("Analyzer.analyze", th2);
                }
                return null;
            case 12:
                l1 l1Var2 = (l1) obj;
                if (l1Var2.f29436d) {
                    Throwable th3 = l1Var2.f29435c;
                    Objects.requireNonNull(th3);
                    h1.a("DeviceOrientationManager.onDeviceOrientationChanged", th3);
                }
                return null;
            case 13:
                l1 l1Var3 = (l1) obj;
                if (l1Var3.f29436d) {
                    Throwable th4 = l1Var3.f29435c;
                    Objects.requireNonNull(th4);
                    h1.a("Observer.onChanged", th4);
                }
                return null;
            case 14:
                l1 l1Var4 = (l1) obj;
                if (l1Var4.f29436d) {
                    Throwable th5 = l1Var4.f29435c;
                    Objects.requireNonNull(th5);
                    h1.a("SystemServicesManager.onCameraError", th5);
                }
                return null;
            case 15:
                l1 l1Var5 = (l1) obj;
                if (l1Var5.f29436d) {
                    Throwable th6 = l1Var5.f29435c;
                    Objects.requireNonNull(th6);
                    h1.a("VideoRecordEventListener.onEvent", th6);
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((sk.a) obj, "<this>");
                return Unit.f27471a;
            case 17:
                sk.a buildSerialDescriptor = (sk.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                sk.a.a(buildSerialDescriptor, "JsonPrimitive", new o(new e(10)));
                sk.a.a(buildSerialDescriptor, "JsonNull", new o(new e(11)));
                sk.a.a(buildSerialDescriptor, "JsonLiteral", new o(new e(12)));
                sk.a.a(buildSerialDescriptor, "JsonObject", new o(new e(13)));
                sk.a.a(buildSerialDescriptor, "JsonArray", new o(new e(14)));
                return Unit.f27471a;
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                q.a(sb2, str);
                sb2.append(':');
                sb2.append(lVar);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            default:
                return f.f34958b;
        }
    }

    public /* synthetic */ a(h1 h1Var, int i) {
        this.f2275b = i;
    }
}
