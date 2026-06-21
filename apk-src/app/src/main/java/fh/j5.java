package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j5 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17459a;

    public j5(sy syVar) {
        this.f17459a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i5 resolve(ParsingContext parsingContext, f6 f6Var, JSONObject jSONObject) {
        boolean z5 = f6Var instanceof k5;
        sy syVar = this.f17459a;
        if (z5) {
            ((f1) syVar.M.getValue()).resolve(parsingContext, ((k5) f6Var).f17562a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof l5) {
            k1 k1Var = (k1) syVar.P.getValue();
            l1 l1Var = ((l5) f6Var).f17673a;
            k1Var.getClass();
            return new i5();
        }
        if (f6Var instanceof m5) {
            ((o1) syVar.S.getValue()).resolve(parsingContext, ((m5) f6Var).f17787a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof n5) {
            s1 s1Var = (s1) syVar.V.getValue();
            t1 t1Var = ((n5) f6Var).f17931a;
            s1Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, t1Var.f18610a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
            JsonFieldResolver.resolveExpression(parsingContext, t1Var.f18611b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
            return new i5();
        }
        if (f6Var instanceof o5) {
            ((w1) syVar.Y.getValue()).resolve(parsingContext, ((o5) f6Var).f18029a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof p5) {
            ((a2) syVar.f18344b0.getValue()).getClass();
            return new i5();
        }
        if (f6Var instanceof q5) {
            k2 k2Var = (k2) syVar.h0.getValue();
            l2 l2Var = ((q5) f6Var).f18146a;
            k2Var.getClass();
            Field field = l2Var.f17666a;
            sy syVar2 = k2Var.f17555a;
            return new i5();
        }
        if (f6Var instanceof r5) {
            ((o2) syVar.f18442k0.getValue()).resolve(parsingContext, ((r5) f6Var).f18215a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof s5) {
            ((s2) syVar.f18472n0.getValue()).resolve(parsingContext, ((s5) f6Var).f18288a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof t5) {
            w2 w2Var = (w2) syVar.f18502q0.getValue();
            x2 x2Var = ((t5) f6Var).f18616a;
            w2Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, x2Var.f18981a, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING);
            return new i5();
        }
        if (f6Var instanceof u5) {
            a3 a3Var = (a3) syVar.f18532t0.getValue();
            b3 b3Var = ((u5) f6Var).f18673a;
            a3Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, b3Var.f16892a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            return new i5();
        }
        if (f6Var instanceof v5) {
            j3 j3Var = (j3) syVar.f18561w0.getValue();
            l3 l3Var = ((v5) f6Var).f18742a;
            j3Var.getClass();
            j3.a(parsingContext, l3Var, jSONObject);
            return new i5();
        }
        if (f6Var instanceof w5) {
            ((w3) syVar.C0.getValue()).resolve(parsingContext, ((w5) f6Var).f18824a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof x5) {
            c4 c4Var = (c4) syVar.F0.getValue();
            e4 e4Var = ((x5) f6Var).f18985a;
            c4Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, e4Var.f17131a, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            JsonFieldResolver.resolveOptionalExpression(parsingContext, e4Var.f17132b, jSONObject, "temporary", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, d4.f17052a);
            return new i5();
        }
        if (f6Var instanceof y5) {
            ((h4) syVar.I0.getValue()).resolve(parsingContext, ((y5) f6Var).f19079a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof z5) {
            ((l4) syVar.L0.getValue()).resolve(parsingContext, ((z5) f6Var).f19197a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof a6) {
            p4 p4Var = (p4) syVar.O0.getValue();
            q4 q4Var = ((a6) f6Var).f16798a;
            p4Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, q4Var.f18144a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            JsonFieldResolver.resolveOptionalExpression(parsingContext, q4Var.f18145b, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            return new i5();
        }
        if (f6Var instanceof b6) {
            ((v4) syVar.R0.getValue()).resolve(parsingContext, ((b6) f6Var).f16903a, jSONObject);
            return new i5();
        }
        if (f6Var instanceof c6) {
            f5 f5Var = (f5) syVar.f18333a1.getValue();
            h5 h5Var = ((c6) f6Var).f17003a;
            f5Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, h5Var.f17326a, jSONObject, "action", g5.f17257a, v0.f18729r);
            JsonFieldResolver.resolveExpression(parsingContext, h5Var.f17327b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            return new i5();
        }
        if (f6Var instanceof d6) {
            ((i6) syVar.f18399g1.getValue()).resolve(parsingContext, ((d6) f6Var).f17053a, jSONObject);
            return new i5();
        }
        if (!(f6Var instanceof e6)) {
            throw new ij.j();
        }
        o6 o6Var = (o6) syVar.f18432j1.getValue();
        q6 q6Var = ((e6) f6Var).f17133a;
        o6Var.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, q6Var.f18147a, jSONObject, "action", p6.f18085a, v0.f18731t);
        JsonFieldResolver.resolveExpression(parsingContext, q6Var.f18148b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
        return new i5();
    }
}
