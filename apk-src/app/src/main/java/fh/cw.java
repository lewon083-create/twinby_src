package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cw implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17042a;

    public cw(sy syVar) {
        this.f17042a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j6 resolve(ParsingContext parsingContext, mw mwVar, JSONObject jSONObject) {
        boolean z5 = mwVar instanceof kw;
        sy syVar = this.f17042a;
        if (z5) {
            vz vzVar = (vz) syVar.f18353ba.getValue();
            wz wzVar = ((kw) mwVar).f17656a;
            vzVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, wzVar.f18963b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING);
            return new bw();
        }
        if (mwVar instanceof iw) {
            zy zyVar = (zy) syVar.M9.getValue();
            az azVar = ((iw) mwVar).f17452a;
            zyVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, azVar.f16887b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            return new bw();
        }
        if (mwVar instanceof hw) {
            ux uxVar = (ux) syVar.G9.getValue();
            vx vxVar = ((hw) mwVar).f17375a;
            uxVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, vxVar.f18815b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
            return new bw();
        }
        if (mwVar instanceof ew) {
            o oVar = (o) syVar.f18451l.getValue();
            p pVar = ((ew) mwVar).f17170a;
            oVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, pVar.f18076b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            return new bw();
        }
        if (mwVar instanceof fw) {
            w wVar = (w) syVar.f18510r.getValue();
            x xVar = ((fw) mwVar).f17244a;
            wVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, xVar.f18965b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            return new bw();
        }
        if (mwVar instanceof lw) {
            d00 d00Var = (d00) syVar.f18419ha.getValue();
            e00 e00Var = ((lw) mwVar).f17781a;
            d00Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, e00Var.f17126b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            return new bw();
        }
        if (mwVar instanceof gw) {
            m0 m0Var = (m0) syVar.D.getValue();
            n0 n0Var = ((gw) mwVar).f17311a;
            m0Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, n0Var.f17927b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT);
            return new bw();
        }
        if (!(mwVar instanceof dw)) {
            if (!(mwVar instanceof jw)) {
                throw new ij.j();
            }
            ((iz) syVar.S9.getValue()).resolve(parsingContext, ((jw) mwVar).f17552a, jSONObject);
            return new bw();
        }
        g gVar = (g) syVar.f18386f.getValue();
        h hVar = ((dw) mwVar).f17121a;
        gVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, hVar.f17316b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        return new bw();
    }
}
