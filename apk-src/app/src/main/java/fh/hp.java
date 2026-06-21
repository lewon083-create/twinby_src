package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hp implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17363a;

    public hp(sy syVar) {
        this.f17363a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dp resolve(ParsingContext parsingContext, mp mpVar, JSONObject jSONObject) {
        Field field = mpVar.f17886a;
        sy syVar = this.f17363a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17887b, jSONObject, "alignment_horizontal", ip.f17404h, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17888c, jSONObject, "alignment_vertical", ip.i, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17889d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, ip.f17406k, ip.f17397a);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.f17890e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.f17891f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = mpVar.f17893h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper, function1, ip.f17407l);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.i, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.f17894j, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.f17896l, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, mpVar.f17897m, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = ip.f17398b;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17899o, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, ip.f17399c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17902r, jSONObject, "max_value", typeHelper, function1, ip.f17400d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17903s, jSONObject, "min_value", typeHelper, function1, ip.f17401e);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.f17905u, jSONObject, "ranges", syVar.f18416h7, syVar.f18394f7);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17906v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.f17907w, jSONObject, "row_span", typeHelper, function1, ip.f17408m);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.f17909y, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.H, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.O, jSONObject, "transition_triggers", kv.f17646g, ip.f17409n);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.P, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.Q, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mpVar.R, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ip.f17405j, kv.f17653o, ip.f17402f);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, mpVar.S, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, mpVar.T, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, mpVar.U, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = ip.f17403g;
        }
        return new dp(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
