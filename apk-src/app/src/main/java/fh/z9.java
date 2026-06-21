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
public final class z9 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19206a;

    public z9(sy syVar) {
        this.f19206a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v9 resolve(ParsingContext parsingContext, da daVar, JSONObject jSONObject) {
        Field field = daVar.f17056a;
        sy syVar = this.f19206a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, daVar.f17060c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = aa.f16801a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17061d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f17062e, jSONObject, "alignment_horizontal", aa.f16812m, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f17063f, jSONObject, "alignment_vertical", aa.f16813n, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f17064g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, aa.f16819t, aa.f16801a);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17065h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17066j, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = daVar.f17068l;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper, function1, aa.f16802b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f17069m, jSONObject, "clip_to_bounds", typeHelper, function1, aa.f16803c);
        Field field3 = daVar.f17070n;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, function12, aa.f16820u);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f17071o, jSONObject, "content_alignment_horizontal", aa.f16814o, w9.f18837l, aa.f16804d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f17072p, jSONObject, "content_alignment_vertical", aa.f16815p, w9.f18838m, aa.f16805e);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17073q, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17074r, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17075s, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17077u, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, daVar.f17078v, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = aa.f16806f;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17079w, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17080x, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.A, jSONObject, "item_spacing", typeHelper2, function12, aa.f16821v, aa.f16807g);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.B, jSONObject, "items", syVar.f18550u9, syVar.f18530s9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.C, jSONObject, "layout_mode", aa.f16816q, v0.G, aa.f16808h);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.F, jSONObject, "line_spacing", typeHelper2, function12, aa.f16822w, aa.i);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.G, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.I, jSONObject, Device.JsonKeys.ORIENTATION, aa.f16817r, v0.H, aa.f16809j);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.K, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.L, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.M, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.N, jSONObject, "row_span", typeHelper2, function12, aa.f16823x);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.O, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.Q, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.V, jSONObject, "transition_triggers", kv.f17646g, aa.f16824y);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.W, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, daVar.X, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.Y, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, aa.f16818s, kv.f17653o, aa.f16810k);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, daVar.Z, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f17057a0, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, daVar.f17059b0, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = aa.f16811l;
        }
        return new v9(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
