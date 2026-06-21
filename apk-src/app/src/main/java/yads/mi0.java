package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.serialization.BuiltInParserKt;
import fh.xa;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f40918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ih0 f40919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kh0 f40920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ji0 f40921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hn f40922e;

    public /* synthetic */ mi0(ko2 ko2Var) {
        this(ko2Var, new ih0(ko2Var), new kh0(), new ji0(), new hn());
    }

    public final hi0 a(xf0 xf0Var, boolean z5) {
        xa xaVarDeserialize;
        eg0[] eg0VarArr = eg0.f38124b;
        CachingTemplateProvider cachingTemplateProvider = null;
        byte b2 = 0;
        if ("divkit".equals(xf0Var.f44681a)) {
            try {
                String str = xf0Var.f44682b;
                String strA = xf0Var.f44683c;
                if (z5) {
                    this.f40922e.getClass();
                    strA = hn.a(strA);
                }
                JSONObject jSONObject = new JSONObject(strA);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List list = xf0Var.f44684d;
                ih0 ih0Var = this.f40919b;
                ih0Var.getClass();
                try {
                    ti0 ti0Var = ih0Var.f39541b;
                    ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
                    ti0Var.getClass();
                    DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(parsingErrorLogger, cachingTemplateProvider, 2, b2 == true ? 1 : 0);
                    if (jSONObject3 != null) {
                        divParsingEnvironment.parseTemplates(jSONObject3);
                    }
                    ih0Var.f39542c.getClass();
                    int i = xa.f18996a;
                    xaVarDeserialize = ((fh.ya) BuiltInParserKt.getBuiltInParserComponent().E2.getValue()).deserialize(divParsingEnvironment, jSONObject2);
                } catch (Throwable th2) {
                    ih0Var.f39540a.reportError("Failed to create DivData", th2);
                    xaVarDeserialize = null;
                }
                this.f40920c.getClass();
                DivDataTag divDataTag = new DivDataTag(UUID.randomUUID().toString());
                Set setA = this.f40921d.a(jSONObject2);
                if (xaVarDeserialize != null) {
                    return new hi0(str, jSONObject2, jSONObject3, list, xaVarDeserialize, divDataTag, setA, new yf0(xf0Var.f44685e));
                }
            } catch (Throwable th3) {
                this.f40918a.reportError("Failed to parse DivKit design", th3);
            }
        }
        return null;
    }

    public mi0(ko2 ko2Var, ih0 ih0Var, kh0 kh0Var, ji0 ji0Var, hn hnVar) {
        this.f40918a = ko2Var;
        this.f40919b = ih0Var;
        this.f40920c = kh0Var;
        this.f40921d = ji0Var;
        this.f40922e = hnVar;
    }
}
