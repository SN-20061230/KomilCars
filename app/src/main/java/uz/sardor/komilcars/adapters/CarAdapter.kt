//package uz.sardor.komilcars.adapters
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import uz.sardor.komilcars.R
//import uz.sardor.komilcars.model.Car
//
//class CarAdapter(var list1:MutableList<Car>, var carInterface:CarInterface) :RecyclerView.Adapter<CarAdapter.CarHolder>(){
//
//     class CarHolder(itemView: View):RecyclerView.ViewHolder(itemView){
////         val photo:ImageView = itemView.findViewById(R.id.car_photo)
////         val company_name:TextView = itemView.findViewById(R.id.company_name)
////         val model_name:TextView = itemView.findViewById(R.id.model_name)
////         val price: TextView = itemView.findViewById(R.id.price_button)
////         val liked:ImageView = itemView.findViewById(R.id.like)
//     }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
////        val holder = CarHolder(LayoutInflater.from(parent.context).inflate(R.layout.offer_item,parent,false))
//        return holder
//    }
//
//    override fun getItemCount(): Int {
//        return list1.size
//    }
//
//    override fun onBindViewHolder(holder: CarHolder, position: Int) {
//        var item1 = list1[position]
//        holder.photo.setImageResource(item1.photo)
//        holder.company_name.text = item1.company_name
//        holder.model_name.text = item1.model_name
//        holder.price.text = item1.price
//        holder.liked.setImageResource(item1.liked)
//        holder.itemView.setOnClickListener {
//            carInterface.OnItemClick(item1)
//        }
//        var a = 0
//        holder.liked.setOnClickListener {
//                if (a == 0){
//                    holder.liked.setImageResource(R.drawable.like_filled)
//                        a = 1
//                }
//
//                }
//        holder.liked.setOnClickListener {
//                if (a == 1) {
//                    holder.liked.setOnClickListener {
//                        holder.liked.setImageResource(R.drawable.like_unfilled)
//                        a = 0
//                    }
//
//                }
//            else{
//                    holder.liked.setImageResource(R.drawable.like_filled)
//                }
////            holder.liked.setOnClickListener {
////                holder.liked.setImageResource(R.drawable.like_filled)
////                a = 1
////            }
//
//            }
//
//
//
//        }
//    interface CarInterface{
//        fun OnItemClick(car: Car)
//
//
//    }
//
//    }
//
