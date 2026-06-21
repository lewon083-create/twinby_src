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
public final class lf implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17707a;

    public lf(sy syVar) {
        this.f17707a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bf resolve(ParsingContext parsingContext, nf nfVar, JSONObject jSONObject) {
        Field field = nfVar.f17946a;
        sy syVar = this.f17707a;
        Field field2 = nfVar.f17947b;
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_item_color", typeHelper, function1, mf.f17831a);
        Field field3 = nfVar.f17948c;
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "active_item_size", typeHelper2, function12, mf.f17843n, mf.f17832b);
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.f17950e, jSONObject, "alignment_horizontal", mf.f17839j, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.f17951f, jSONObject, "alignment_vertical", mf.f17840k, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.f17952g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper2, function12, mf.f17844o, mf.f17833c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.f17953h, jSONObject, "animation", mf.f17841l, be.A, mf.f17834d);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.i, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.f17954j, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field4 = nfVar.f17956l;
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, function13, mf.f17845p);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.f17957m, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.f17958n, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.f17960p, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, nfVar.f17961q, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = mf.f17835e;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.f17963s, jSONObject, "inactive_item_color", typeHelper, function1, mf.f17836f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.f17969y, jSONObject, "minimum_item_size", typeHelper2, function12, mf.f17846q, mf.f17837g);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.C, jSONObject, "row_span", typeHelper3, function13, mf.f17847r);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.D, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.G, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.L, jSONObject, "transition_triggers", kv.f17646g, mf.f17848s);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.M, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.N, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nfVar.O, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, mf.f17842m, kv.f17653o, mf.f17838h);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, nfVar.P, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, nfVar.Q, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, nfVar.R, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = mf.i;
        }
        return new bf(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
