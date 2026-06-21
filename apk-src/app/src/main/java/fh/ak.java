package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.Device;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ak implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16835a;

    public ak(sy syVar) {
        this.f16835a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yj deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f16835a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", dk.f17103k, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", dk.f17104l, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, dk.f17109q, dk.f17094a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper, function1, dk.f17110r);
        TypeHelper typeHelper2 = dk.f17105m;
        mg mgVar = mg.f17861t;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_axis_alignment", typeHelper2, mgVar, dk.f17095b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper, function1, dk.f17111s, dk.f17096c);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        ij.p pVar4 = syVar.T6;
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = dk.f17097d;
        }
        lo loVar2 = loVar;
        TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "infinite_scroll", typeHelper3, function12, dk.f17098e);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", syVar.f18530s9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Device.JsonKeys.ORIENTATION, dk.f17106n, mg.f17862u, dk.f17099f);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper3, function12, dk.f17100g);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper, function1, dk.f17112t);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_axis_alignment", dk.f17107o, mgVar, dk.f17101h);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", syVar.f18443k1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, dk.f17113u);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, dk.f17108p, kv.f17653o, dk.i);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = dk.f17102j;
        }
        return new yj(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
