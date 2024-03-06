import { Contact, MessageSquare } from "lucide-react";
import Image from "next/image";
import React from "react";

function Header() {
  return (
    <div className=" bg-red-900 h-20 w-full mx-auto px-8 flex items-center justify-between sticky top-0 z-30 ">
      <Image src="/images/logo.png" width={100} height={100} />

      <div className="flex">
        <a
          href="#"
          className=" text-black hover:text-black hover:border-yellow-500 border-b-3 border-transparent transition-all duration-300 ease-in-out mr-4"
        >
          Home
        </a>
        <a
          href="#about"
          className=" text-black hover:text-black hover:border-yellow-500 border-b-3 border-transparent transition-all duration-300 ease-in-out mr-4"
        >
          About
        </a>
        <a
          href="#portfolio"
          className=" text-black hover:text-black hover:border-yellow-500 border-b-3 border-transparent transition-all duration-300 ease-in-out mr-4"
        >
          Portfolio
        </a>
        <a
          href="#skills"
          className=" text-black hover:text-black hover:border-yellow-500 border-b-3 border-transparent transition-all duration-300 ease-in-out mr-4"
        >
          Skills
        </a>
      </div>

      <button className=" bg-white text-black flex items-center justify-center py-2 px-4 rounded-full border border-black gap-3">
        <MessageSquare />
        Contact Me
      </button>
    </div>
  );
}

export default Header;

// "use client";
// import React from "react";
// import { useEffect, useState } from "react";
// import Switcher from "./Switcher";

// function Header() {
//   //   const [scrolling, setScrolling] = useState(false);

//   //   const onPageScroll = () => {
//   //     if (window.pageYOffset > 200) {
//   //       setScrolling(true);
//   //     } else {
//   //       setScrolling(false);
//   //     }
//   // //   };

//   //   useEffect(() => {
//   //     window.addEventListener("scroll", onPageScroll);
//   //     return () => {
//   //       window.removeEventListener("scroll", onPageScroll);
//   //     };
//   //   }, []);
//   return (
//     <div>
//       <header
//       // className={`${
//       //   scrolling ? "border-b border-gray-900" : ""
//       // }  fixed left-0 right-0 top-0 z-20`}
//       // id="home"
//       >
//         <div className=" w-full m-auto px-4 py-6  bg-white">
//           <div className="flex flex-col gap-4 sm:flex-row justify-between items-center">
//             <div>
//               <h1 className="font-bold text-blue-300 text-2xl">
//                 Personal Portifolio
//               </h1>
//             </div>
//             <div>
//               <ul className="flex gap-4">
//                 <Switcher />
//                 <li>
//                   <a
//                     href="#projects"
//                     className="text-black hover:text-gray-600 cursor-pointer"
//                   >
//                     Projects
//                   </a>
//                 </li>
//                 <li>
//                   <a
//                     href="#technologies"
//                     className="text-black hover:text-gray-600 cursor-pointer"
//                   >
//                     Technologies
//                   </a>
//                 </li>
//                 <li>
//                   <a
//                     href="#aboutme"
//                     className="text-black hover:text-gray-600 cursor-pointer"
//                   >
//                     About me
//                   </a>
//                 </li>
//               </ul>
//             </div>
//           </div>
//         </div>
//       </header>
//     </div>
//   );
// }

// export default Header;
