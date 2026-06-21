package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rv implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18266a;

    public rv(sy syVar) {
        this.f18266a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qv resolve(ParsingContext parsingContext, aw awVar, JSONObject jSONObject) {
        boolean z5 = awVar instanceof yv;
        sy syVar = this.f18266a;
        if (z5) {
            rz rzVar = (rz) syVar.Y9.getValue();
            sz szVar = ((yv) awVar).f19187a;
            rzVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, szVar.f18600a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING);
            return new qv();
        }
        if (awVar instanceof wv) {
            qx qxVar = (qx) syVar.D9.getValue();
            rx rxVar = ((wv) awVar).f18934a;
            qxVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, rxVar.f18284a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
            return new qv();
        }
        if (awVar instanceof xv) {
            vy vyVar = (vy) syVar.J9.getValue();
            wy wyVar = ((xv) awVar).f19067a;
            vyVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, wyVar.f18961a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            return new qv();
        }
        if (awVar instanceof uv) {
            s sVar = (s) syVar.f18482o.getValue();
            t tVar = ((uv) awVar).f18716a;
            sVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, tVar.f18601a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            return new qv();
        }
        if (awVar instanceof tv) {
            k kVar = (k) syVar.i.getValue();
            l lVar = ((tv) awVar).f18665a;
            kVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, lVar.f17664a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            return new qv();
        }
        if (awVar instanceof zv) {
            zz zzVar = (zz) syVar.f18385ea.getValue();
            a00 a00Var = ((zv) awVar).f19294a;
            zzVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, a00Var.f16787a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            return new qv();
        }
        if (awVar instanceof vv) {
            i0 i0Var = (i0) syVar.A.getValue();
            j0 j0Var = ((vv) awVar).f18809a;
            i0Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, j0Var.f17456a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT);
            return new qv();
        }
        if (!(awVar instanceof sv)) {
            throw new ij.j();
        }
        c cVar = (c) syVar.f18354c.getValue();
        d dVar = ((sv) awVar).f18326a;
        cVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, dVar.f17046a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        return new qv();
    }
}
