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
import io.sentry.protocol.Device;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xd implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19000a;

    public xd(sy syVar) {
        this.f19000a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ud resolve(ParsingContext parsingContext, zd zdVar, JSONObject jSONObject) {
        Field field = zdVar.f19213a;
        sy syVar = this.f19000a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19214b, jSONObject, "alignment_horizontal", yd.f19103l, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19215c, jSONObject, "alignment_vertical", yd.f19104m, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19216d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, yd.f19110s, yd.f19093a);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.f19217e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.f19218f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = zdVar.f19220h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_count", typeHelper, function1, yd.f19111t);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.i, jSONObject, "column_span", typeHelper, function1, yd.f19112u);
        Field field3 = zdVar.f19221j;
        TypeHelper typeHelper2 = yd.f19105n;
        w9 w9Var = w9.f18849x;
        Expression expression = yd.f19094b;
        Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_content_alignment", typeHelper2, w9Var, expression);
        Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
        Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19222k, jSONObject, "cross_spacing", typeHelper, function1, yd.f19113v);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19223l, jSONObject, "default_item", typeHelper, function1, yd.f19114w, yd.f19095c);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.f19224m, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.f19225n, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.f19227p, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, zdVar.f19228q, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = yd.f19096d;
        }
        lo loVar2 = loVar;
        Field field4 = zdVar.f19231t;
        uc ucVar = yd.f19115x;
        Expression expression3 = yd.f19097e;
        Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "item_spacing", typeHelper, function1, ucVar, expression3);
        if (expressionResolveOptionalExpression5 != null) {
            expression3 = expressionResolveOptionalExpression5;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.f19232u, jSONObject, "items", syVar.f18550u9, syVar.f18530s9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19235x, jSONObject, Device.JsonKeys.ORIENTATION, yd.f19106o, w9.f18850y, yd.f19098f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.f19237z, jSONObject, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, yd.f19099g);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.A, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.B, jSONObject, "row_span", typeHelper, function1, yd.f19116y);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.C, jSONObject, "scroll_mode", yd.f19107p, w9.f18851z, yd.f19100h);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.D, jSONObject, "scrollbar", yd.f19108q, w9.A, yd.i);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.E, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.F, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.K, jSONObject, "transition_triggers", kv.f17646g, yd.f19117z);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.L, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.M, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zdVar.N, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, yd.f19109r, kv.f17653o, yd.f19101j);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, zdVar.O, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, zdVar.P, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, zdVar.Q, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = yd.f19102k;
        }
        return new ud(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, expressionResolveOptionalExpression4, listResolveOptionalList, loVar2, expression3, ywVar, listResolveOptionalList2, loVar3);
    }
}
