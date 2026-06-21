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
public final class hr implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17364a;

    public hr(sy syVar) {
        this.f17364a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final er resolve(ParsingContext parsingContext, pr prVar, JSONObject jSONObject) {
        Field field = prVar.f18107a;
        sy syVar = this.f17364a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18108b, jSONObject, "alignment_horizontal", ir.f17419k, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18109c, jSONObject, "alignment_vertical", ir.f17420l, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18110d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, ir.f17422n, ir.f17410a);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.f18111e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.f18112f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = prVar.f18114h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper, function1, ir.f17423o);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, prVar.i, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        Field field3 = prVar.f18115j;
        TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "dynamic_height", typeHelper2, function12, ir.f17411b);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.f18116k, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.f18118m, jSONObject, "functions", syVar.J3, syVar.H3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18119n, jSONObject, "has_separator", typeHelper2, function12, ir.f17412c);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, prVar.f18120o, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = ir.f17413d;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveList(parsingContext, prVar.f18122q, jSONObject, "items", syVar.U7, syVar.S7, ir.f17424p);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18126u, jSONObject, "restrict_parent_scroll", typeHelper2, function12, ir.f17414e);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18127v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18128w, jSONObject, "row_span", typeHelper, function1, ir.f17425q);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.f18129x, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18130y, jSONObject, "selected_tab", typeHelper, function1, ir.f17426r, ir.f17415f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.f18131z, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, ir.f17416g);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.B, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, function12, ir.f17417h);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.F, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.K, jSONObject, "transition_triggers", kv.f17646g, ir.f17427s);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.L, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, prVar.M, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, prVar.N, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ir.f17421m, kv.f17653o, ir.i);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, prVar.O, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, prVar.P, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, prVar.Q, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = ir.f17418j;
        }
        return new er(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
